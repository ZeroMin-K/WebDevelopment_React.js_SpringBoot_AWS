package chapter02;

public class Ex2_8 {

}

public class MyService {
	TodoService todoService;
	ShareService sharreService;
	NotificationService notificationService;
	ScheduledExecutorservice scheduledExecutorService;
}

public class ShareService {
	UserService userService;
	EventService eventService;
	SharePersistence persistence;
}

public class NotificationService {
	EventService eventService;
	UserService userService;
	NotificationPersistence persistence;
}

public class SharePersistence {
	JDBCConnection connection;
}