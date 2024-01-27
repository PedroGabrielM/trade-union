package br.com.gameoverproject.tradeunion.notification.controller;

import br.com.gameoverproject.tradeunion.notification.domain.Notification;
import br.com.gameoverproject.tradeunion.notification.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/notification")
public class NotificationController {

    @Autowired
    private NotificationService notificationService;

    @GetMapping("/documents")
    public ResponseEntity<List<Notification>> findAll(){
        return ResponseEntity.status(HttpStatus.OK).body(notificationService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Notification>> findById(@PathVariable Long id){
        return ResponseEntity.status(HttpStatus.OK).body(notificationService.findById(id));
    }

    @PostMapping
    public ResponseEntity<Notification> create(@RequestBody Notification notification){
        return ResponseEntity.status(HttpStatus.CREATED).body(notificationService.save(notification));
    }

    @PutMapping
    public ResponseEntity<Notification> update(@RequestBody Notification notification){
        return ResponseEntity.status(HttpStatus.OK).body(notificationService.update(notification));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
        notificationService.deleteById(id);
        return ResponseEntity.status(HttpStatus.OK).build();
    }
}
