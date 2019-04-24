package fr.rphstudio.chess.game;

import fr.rphstudio.chess.interf.IChess;

public class Board {
    private Piece [][] table;

    public Board() {
        this.table = new  Piece [IChess.BOARD_WIDTH][IChess.BOARD_HEIGHT];
        table [2][0] = new Piece(IChess.ChessColor.CLR_WHITE, IChess.ChessType.TYP_PAWN);

    }

    public Piece getPieces(IChess.ChessPosition position){
        if ((position.x > IChess.BOARD_WIDTH) || (position.y > IChess.BOARD_HEIGHT) || (position.x < 0) || (position.y < 0)){
            return null;
        }
        return table [position.x][position.y];
    }
}
