package robo;

public class AlphaRobot extends AbstractRobot{
	private String name;
	private String model;
	private int x;
	private int y;
	
	public AlphaRobot() {
		this.x = 0;
		this.y = 0;
	}
	
	public AlphaRobot(String name, String model) {
		this.name = name;
		this.model = model;
		this.x = 0;
		this.y = 0;
	}

	@Override
	public void setName(String name) {
		if(name!=null) 
			this.name = name;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public void setModel(String model) {
		if(model!=null) 
			this.model = model;
		
	}

	@Override
	public String getModel() {
		return this.model;
	}

	@Override
	public void setX(int x) throws CoordinateRangeException{
		if( x<0 || x>100 )
			throw new CoordinateRangeException("Incorrect range value");
		else this.x = x;
	}

	@Override
	public int getX() {
		return this.x;
	}

	@Override
	public void setY(int y) throws CoordinateRangeException {
		if( y<0 || y>100 ) 
			throw new CoordinateRangeException("Incorrect range value");
		this.y = y;		
	}

	@Override
	public int getY() {
		return this.y;
	}

	@Override
	public boolean moveRight() {
		if (this.x<100){
			this.x = this.x + 1;
			return true;
			}
		return false;
	}

	@Override
	public boolean moveLeft() {
		if (this.x>=1){
			this.x = this.x - 1;
			return true;
			}
		return false;
	}

	@Override
	public boolean moveDown() {
		if (this.y>=1){
			this.y = this.y - 1;
			return true;
			}
		return false;
	}

	@Override
	public boolean moveUp() {
		if (this.y<100){
			this.y = this.y + 1;
			return true;
			}
		return false;
	}

}
