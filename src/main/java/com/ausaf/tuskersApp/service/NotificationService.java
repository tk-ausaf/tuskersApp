package com.ausaf.tuskersApp.service;

import com.ausaf.tuskersApp.entity.Notification;
import com.ausaf.tuskersApp.repository.notification.NotificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotificationService {

    @Autowired
    private NotificationRepository notificationRepository;

    public boolean createNotification(Notification notification) {
        notificationRepository.save(notification);
        return true;
    }

    public List<Notification> getAllNotifications() {
        return notificationRepository.findAll();
    }
}
