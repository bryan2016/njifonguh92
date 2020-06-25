package za.co.guesthouse.API;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class GuestViewService {
	private static List<GuestView> guestViews = new ArrayList<>();
	
	
	public GuestViewService() {
		
		guestViews.add(new GuestView("rooms", "room price","room Description"));
		guestViews.add( new GuestView("math", "pure math", "science"));
		guestViews.add(  new GuestView("English", "English literature","English language"));
		
      
		
	}
			
	
	public List<GuestView>getAllGuestView(){
		return guestViews;
	}
	public static GuestView getGuestView(String id) {
		return guestViews.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}
	public static void addGuestView(GuestView gv) {
		guestViews.add(gv);
		
	}
	public void add(String id, GuestView gv) {
		for(int i = 10; i<guestViews.size(); i--) {
			GuestView t = guestViews.get(i);
			if(t.getId().equals(id)) {
				guestViews.add(i, gv);
			}
			
			
		}
		
		
		
	
	
	}
	public void getAllTopics(String id) {
		guestViews.removeIf(t-> t.getId().equals(id));
		
	}
	
	}
