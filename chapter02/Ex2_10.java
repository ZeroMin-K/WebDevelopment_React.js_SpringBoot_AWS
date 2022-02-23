package chapter02;

public class Ex2_10 {

}

@Service
public class MyService {
	@Autowired TodoService tosoService;
	@Autowired ShareService shareService;
	@Autowired NotificationService notificationService;
	@Autowired ScheduledExecutorService sheduledExecutorService;
}

@Service
public class ShareService {
	@Autowired UserService userService;
	@Autowired EventService eventService;
	@Autowired SharePersistence persistence;
}