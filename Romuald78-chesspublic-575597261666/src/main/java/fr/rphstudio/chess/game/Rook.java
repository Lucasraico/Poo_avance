package fr.rphstudio.chess.game;

import fr.rphstudio.chess.interf.IChess;
import fr.rphstudio.chess.interf.IMove;

import java.util.ArrayList;
import java.util.List;


public class Rook implements IMove{

    public List<IChess.ChessPosition> getPossibleMoves(IChess.ChessPosition position, Board board) {

        ArrayList<IChess.ChessPosition> listPosition = new ArrayList<IChess.ChessPosition>();

        int[][] move = {{-1, 0}, {-3, 0}, {-4, 0}, {-5, 0}, {-6, 0}, {-7, 0},
                {1, 0}, {2, 0}, {3, 0}, {4, 0}, {5, 0}, {6, 0}, {7, 0},
                {0, -1}, {0, -2}, {0, -3}, {0,-4}, {0,-5}, {0,-6}, {0,-7},
                {0, 1}, {0, 2}, {0, 3}, {0,4}, {0,5}, {0,6}, {0,7}
        };

        for (int i = 0; i < move.length; i++) {

            IChess.ChessPosition position2 = new IChess.ChessPosition(position.x + move[i][0], position.y + move[i][1]);

            if (position2.isValid()) {

                Piece piece2 = board.getPieces(position2.x , position2.y);


                if (piece2 != null) {

                    if (piece2.getColor() == board.getPieces(position.x, position.y).getColor() ) {
                        continue;
                    }
                }

                listPosition.add(new IChess.ChessPosition(position.x + move[i][0], position.y + move[i][1]));
            }
        }

        return listPosition;
    }
}
