package za.co.guesthouse.API;

	import java.util.List;
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.web.bind.annotation.PathVariable;
	import org.springframework.web.bind.annotation.RequestBody;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RequestMethod;
	import org.springframework.web.bind.annotation.RestController;
	@RestController
	public class GuestViewController {
		@Autowired
		private GuestViewService guestViewService;
		
		@RequestMapping("/guestView")
		public List<GuestView> getAllGuestView(){
			return guestViewService.getAllGuestView();
			
		}
	
		@RequestMapping(method=RequestMethod.POST, value="/guestView")
		public void addGuestView(@RequestBody GuestView gv) {
			GuestViewService.addGuestView(gv);
		}
		@RequestMapping(method=RequestMethod.PUT, value="/guestView/{id}")
		public void addGuestView(@RequestBody GuestView gv, @PathVariable String id) {
			GuestViewService.addGuestView(gv);
		}
		
		@RequestMapping(method=RequestMethod.DELETE, value="/guestView/{id}")
		public void getGuestView(@RequestBody GuestView guestView, @PathVariable String id) {
			GuestViewService.getGuestView(id);
		}
}
