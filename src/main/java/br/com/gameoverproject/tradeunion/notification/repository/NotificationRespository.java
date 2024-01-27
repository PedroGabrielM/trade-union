package br.com.gameoverproject.tradeunion.notification.repository;

import br.com.gameoverproject.tradeunion.notification.domain.Notification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotificationRespository extends JpaRepository<Notification, Long> {
}
