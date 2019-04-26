package fr.rphstudio.chess.game;


import fr.rphstudio.chess.interf.IChess;
import fr.rphstudio.chess.interf.IMove;
import fr.rphstudio.chess.interf.IChess.ChessPosition;




import java.util.ArrayList;
import java.util.List;

public class Knight implements IMove {

    public List<ChessPosition> getPossibleMoves(ChessPosition position, Board board) {

        ArrayList<ChessPosition> listPosition = new ArrayList<ChessPosition>();

        int[][] move = {{2, 1}, {2, -1}, {-2, 1}, {-2, -1}, {1, 2}, {1, -2}, {-1, 2}, {-1, -2}};

        for (int i = 0; i < move.length; i++) {

            ChessPosition position2 = new ChessPosition(position.x + move[i][0], position.y + move[i][1]);

            if (position2.isValid()) {

                Piece piece2 = board.getPieces(position2.x, position.y);


                if (piece2 != null) {

                    if (piece2.getColor() == board.getPieces(position.x ,position.y).getColor() ) {
                        continue;
                    }
                }

                listPosition.add(new ChessPosition(position.x + move[i][0], position.y + move[i][1]));
            }
        }

        return listPosition;
    }

}