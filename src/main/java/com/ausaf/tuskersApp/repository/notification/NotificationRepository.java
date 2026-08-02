package com.ausaf.tuskersApp.repository.notification;

import com.ausaf.tuskersApp.entity.Notification;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotificationRepository extends MongoRepository<Notification, String> {
}
