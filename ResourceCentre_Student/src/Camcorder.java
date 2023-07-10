import java.util.ArrayList;

public class Camcorder extends Item{
private int opticalZoom;

	public Camcorder(String assetTag, String description, int opticalZoom) {
		super(assetTag, description);
		this.opticalZoom = opticalZoom;
	}

	public int getOpticalZoom() {
		return opticalZoom;
	}
	
	public String toString(){
		String output = "";
		// Write your codes here
		return output;
	}
	
	public static void addCamcorder(ArrayList<Camcorder> camcorderList, Camcorder cc) {
		Camcorder item;
		for(int i = 0; i < camcorderList.size(); i++) {
			item = camcorderList.get(i);
			if (item.getAssetTag().equalsIgnoreCase(cc.getAssetTag()) )
				return;
		}

		if ((cc.getAssetTag().isEmpty()) || (cc.getDescription().isEmpty()) ) {
			return;
		}

		camcorderList.add(cc);
		}
	
	public static Camcorder inputCamcorder() {
		String tag = Helper.readString("Enter asset tag > ");
		String description = Helper.readString("Enter description > ");
		int zoom = Helper.readInt("Enter optical zoom > ");

		Camcorder cc= new Camcorder(tag, description, zoom);
		return cc;
	}

}

