package com.itcorey.job;

import com.itcorey.Service.IUserService;
import com.itcorey.Service.QuartzInfoService;
import com.itcorey.Service.impl.QuartzLogService;
import com.itcorey.domain.QuartzInfo;
import com.itcorey.domain.QuartzLog;
import com.itcorey.domain.User;
import org.apache.log4j.Logger;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import tool.util.BeanUtil;
import tool.util.DateUtil;

import javax.xml.rpc.ServiceException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by ：Corey
 * 17:37 2019/2/22
 * 定时任务
 */
public class QuartzInform implements Job {

    private static final Logger logger = Logger.getLogger(QuartzInform.class);

    /**
     * 还款提醒
     * @throws ServiceException
     */
    public String repayInform() throws ServiceException {
        IUserService userService = (IUserService) BeanUtil.getBean("IUserService");
        logger.info("进入定时任务......");
        String quartzRemark = null;
        int succeed = 0;
        int fail = 0;
        int total = 0;
        //查询所有用户
        List<User> list = userService.getAllUser();
        if (!list.isEmpty()) {
            for (User user : list) {
                System.out.println("user"+user.getUserName());
            }
        }
        logger.info("查询所有用户信息结束......");
        quartzRemark = "执行总次数"+total+",成功"+succeed+"次,失败"+fail+"次";
        return quartzRemark;
    }

    @Override
    public void execute(JobExecutionContext arg0) throws JobExecutionException {
        QuartzInfoService quartzInfoService = (QuartzInfoService)BeanUtil.getBean("quartzInfoService");
        QuartzLogService quartzLogService = (QuartzLogService)BeanUtil.getBean("quartzLogService");
        QuartzLog ql = new QuartzLog();
        Map<String,Object> qiData = new HashMap<>();
        QuartzInfo qi = quartzInfoService.findByCode("doRepayInform");
        try {
            qiData.put("id", qi.getId());
            ql.setQuartzId(qi.getId());
            ql.setStartTime(DateUtil.getNow());

            String remark = repayInform();

            ql.setTime(DateUtil.getNow().getTime()-ql.getStartTime().getTime());
            ql.setResult("10");
            ql.setRemark(remark);
            qiData.put("succeed", qi.getSucceed()+1);

        }catch (Exception e) {
            ql.setResult("20");
            qiData.put("fail", qi.getFail()+1);
            logger.error(e.getMessage(),e);
        }finally{
            logger.info("保存定时任务日志");
            quartzLogService.save(ql);
            quartzInfoService.update(qiData);
        }
    }

}
