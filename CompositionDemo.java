class Fan
{
	public void startRotation()
	{
        System.out.println("Starts rotating");
	}
}

class ThreeBladeFan extends Fan
{
    @Override
    public void startRotation()
	{
		System.out.println("Starts rotating 3 blade fan");
	}
}

class FourBladeFan extends Fan
{
    @Override
    public void startRotation()
	{
        System.out.println("Starts rotating 4 blade fan");
    }
}

class OrnamentalFan extends Fan
{
    @Override
    public void startRotation()
	{
        System.out.println("Starts rotating ornamental fan");
    }
}

// Room has a Fan 
// you can also support multiple fans

class Room
{
    private Fan fan; // this can be anytype of fan; no committment here
    // has other things like light, clock ...; not shown!
    /*public Room() {
    this.fan = new OrnamentalFan();
    }*/
    public Room(Fan fan)
	{
		this.fan = fan;
    }
    
	public void rotateFan()
	{
        fan.startRotation();
    }
}

public class CompositionDemo
{
    public static void main(String[] args)
	{
        Room r1 = new Room(new Fan());
        Room r2 = new Room(new OrnamentalFan());
        Room r3 = new Room(new ThreeBladeFan());
        Room r4 = new Room(new FourBladeFan());
        r1.rotateFan();
        r2.rotateFan();
        r3.rotateFan();
        r4.rotateFan();
        /* Room r1=new Room();
        r1.rotateFan();*/
    }
}