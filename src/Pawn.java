

public class Pawn extends Piece {
	private int startX;
	private int startY;

	public Pawn(int x, int y, Side side, Board board) {
		// TODO: Call super constructor
		super(x, y, side, board);
		startX = x;
		startY = y;

	}

	@Override
	public boolean canMove(int destX, int destY) {
		// TODO Auto-generated method stub
		if (getSide() == Side.BLACK) {
			if (destY - y == 1 && destX - x == 0) {
				if (board.get(destX, destY) != null) {
					return false;
				}
				return true;
			}
			if (destY - y == 2 && destX - x == 0 && x == startX && y == startY) {
				return true;
			}
			if (destX == x - 1 && destY == y + 1) {
				Piece fRight = board.get(x - 1, y + 1);
				if (fRight != null) {
					if(fRight.getSide() == Side.negate(getSide())) {
						return true;
					}
				}
			}
			if (destX == x + 1 && destY == y + 1) {
				Piece frontLeft = board.get(x + 1, y + 1);
				if (frontLeft != null) {
					if(frontLeft.getSide() == Side.negate(getSide())) {
						return true;
					}
				}
			}
		}
		if (getSide() == Side.WHITE) {
			if (destY - y == -1 && destX - x == 0) {
				if (board.get(destX, destY) != null) {
					return false;
				}
				return true;
			}
			if (destY - y == -2 && destX - x == 0 && x == startX && y == startY) {
				return true;
			}
			if (destX == x - 1 && destY == y - 1) {
				Piece frontRight = board.get(x - 1, y - 1);
				if (frontRight != null) {
					if(frontRight.getSide() == Side.negate(getSide())) {
						return true;
					}
				}
			}
			if (destX ==x + 1 && destY == y - 1) {
				Piece frontLeft = board.get(x + 1, y - 1);
				if (frontLeft != null) {
					if(frontLeft.getSide() == Side.negate(getSide())) {
						return true;
					}
				}
			}
		}

		return false;
	}

	@Override
	public String getSymbol() {
		// TODO Auto-generated method stub
		return this.getSide() == Side.BLACK ? "♟" : "♙";
	}

}



