package br.com.gameoverproject.tradeunion.notification.mapper;

import br.com.gameoverproject.tradeunion.notification.domain.Notification;
import br.com.gameoverproject.tradeunion.notification.dto.NotificationDTO;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface NotificationMapper {
    NotificationDTO notificationToNotificationDTO(Notification notification);
    Notification notificationDTOToNotification(NotificationDTO notificationDTO);
}
