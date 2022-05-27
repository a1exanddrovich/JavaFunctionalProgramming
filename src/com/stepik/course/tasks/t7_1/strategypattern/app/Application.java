package com.stepik.course.tasks.t7_1.strategypattern.app;

public class Application {

    private EmailService emailService;
    private SMSService smsService;

    public Application(EmailService emailService, SMSService smsService) {
        this.emailService = emailService;
        this.smsService = smsService;
    }

    public void run(User user) {
        Notifier notifier = new Notifier(emailService::sendEmail);
        notifier.notifyUser(user);
        Notifier notifier1 = new Notifier(smsService::sendSMS);
        notifier1.notifyUser(user);
    }

}
