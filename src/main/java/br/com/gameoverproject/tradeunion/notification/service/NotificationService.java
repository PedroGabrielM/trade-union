package br.com.gameoverproject.tradeunion.notification.service;

import br.com.gameoverproject.tradeunion.notification.domain.Notification;

import java.util.List;
import java.util.Optional;

public interface NotificationService {

    Notification save(Notification notification);
    List<Notification> findAll();
    Optional<Notification> findById(Long id);
    Notification update(Notification notification);
    void deleteById(Long id);
}
