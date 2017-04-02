package businessobj;

import java.awt.List;
import java.util.ArrayList;


public class BarrageRoom implements Runnable{
	
	private boolean destroyed;
	private int roomId;
	private User owner;
	private ArrayList<Audience> userList;

	public BarrageRoom(User owner,int roomId) {
		destroyed = false;
		this.owner = owner;
		userList = new ArrayList<Audience>();	
		this.roomId = roomId;
	}
	

	public void receiveBarrage(String barrage){
		
	}
	
	public void registerAudience(Audience audience){
		synchronized (userList) {
			if(!userList.contains(audience)){
				userList.add(audience);
			}
		}
	}
	
	public void destroyRoom(){
		destroyed = true;
	}
	
	public boolean isRoomDestroyed(){
		return destroyed;
	}
	
	public void run() {
		// TODO Auto-generated method stub	
		while(!destroyed){
			publishBarrages();
			
		}
	}

	private void publishBarrages(){
		
	}
	
	
}
