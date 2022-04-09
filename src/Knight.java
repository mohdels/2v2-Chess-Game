
public class Knight extends Piece{
	public Knight(int x, int y, Side side, Board b) {
		super(x, y, side, b);

}
	@Override
	public boolean canMove(int destX, int destY) {
		
		if(Math.abs(this.x - destX) == 2 && Math.abs(this.y - destY) == 1 ||
				Math.abs(this.x - destX) == 1 && Math.abs(this.y - destY) ==2) return true;
		return false;
	}
	@Override
	public String getSymbol() {
		return this.getSide() == Side.BLACK ? "♞" : "♘";
	}
}