import org.springframework.ui.ModelMap;
import org.springframework.beans.factory.annotation.Autowired;

public class UserInterface {

	@Autowired
	private UserService service;

	public ModelMap saveUser(User user) {
		service.saveUser(user);
		return new ModelMap("success", true);
	}

	public User getOneUser(String id) {
		return service.getOneUser(id);
	}
}
