package br.com.gameoverproject.tradeunion.notification.service.impl;

import br.com.gameoverproject.tradeunion.notification.domain.Notification;
import br.com.gameoverproject.tradeunion.notification.repository.NotificationRespository;
import br.com.gameoverproject.tradeunion.notification.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NotificationServiceImpl implements NotificationService {

    private NotificationRespository notificationRespository;

    public NotificationServiceImpl(NotificationRespository notificationRespository) {
        this.notificationRespository = notificationRespository;
    }

    @Override
    public Notification save(Notification notification) {
        return notificationRespository.save(notification);
    }

    @Override
    public List<Notification> findAll() {
        return notificationRespository.findAll();
    }

    @Override
    public Optional<Notification> findById(Long id) {
        return notificationRespository.findById(id);
    }

    @Override
    public Notification update(Notification notification) {
        return notificationRespository.save(notification);
    }

    @Override
    public void deleteById(Long id) {
        notificationRespository.deleteById(id);
    }
}
