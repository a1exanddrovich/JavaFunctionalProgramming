package com.stepik.course.tasks.t7_1.strategypattern.app;

public class Notifier {

    private NotificationStrategy notificationStrategy;

    public Notifier(NotificationStrategy notificationStrategy) {
        this.notificationStrategy = notificationStrategy;
    }

    public void setNotificationStrategy(NotificationStrategy notificationStrategy) {
        this.notificationStrategy = notificationStrategy;
    }

    public void notifyUser(User user) {
        notificationStrategy.notifyCustomer(user);
    }

}
