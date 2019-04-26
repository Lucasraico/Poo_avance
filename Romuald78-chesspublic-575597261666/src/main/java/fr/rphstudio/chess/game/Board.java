package fr.rphstudio.chess.game;

import fr.rphstudio.chess.interf.IChess;

import java.util.List;

public class Board {
    private Piece [][] table;

    public Board() {
        this.table = new  Piece [IChess.BOARD_WIDTH][IChess.BOARD_HEIGHT];
        table [0][0] = new Piece(IChess.ChessColor.CLR_WHITE, IChess.ChessType.TYP_ROOK, new Rook());
        table [1][0] = new Piece(IChess.ChessColor.CLR_WHITE, IChess.ChessType.TYP_KNIGHT, new Knight());
        table [2][0] = new Piece(IChess.ChessColor.CLR_WHITE, IChess.ChessType.TYP_BISHOP, new Pawn());
        table [3][0] = new Piece(IChess.ChessColor.CLR_WHITE, IChess.ChessType.TYP_QUEEN, new Pawn());
        table [4][0] = new Piece(IChess.ChessColor.CLR_WHITE, IChess.ChessType.TYP_KING, new Pawn());
        table [5][0] = new Piece(IChess.ChessColor.CLR_WHITE, IChess.ChessType.TYP_BISHOP, new Pawn());
        table [6][0] = new Piece(IChess.ChessColor.CLR_WHITE, IChess.ChessType.TYP_KNIGHT, new Knight());
        table [7][0] = new Piece(IChess.ChessColor.CLR_WHITE, IChess.ChessType.TYP_ROOK, new Rook());
        table [0][1] = new Piece(IChess.ChessColor.CLR_WHITE, IChess.ChessType.TYP_PAWN, new Pawn());
        table [1][1] = new Piece(IChess.ChessColor.CLR_WHITE, IChess.ChessType.TYP_PAWN, new Pawn());
        table [2][1] = new Piece(IChess.ChessColor.CLR_WHITE, IChess.ChessType.TYP_PAWN, new Pawn());
        table [3][1] = new Piece(IChess.ChessColor.CLR_WHITE, IChess.ChessType.TYP_PAWN, new Pawn());
        table [4][1] = new Piece(IChess.ChessColor.CLR_WHITE, IChess.ChessType.TYP_PAWN, new Pawn());
        table [5][1] = new Piece(IChess.ChessColor.CLR_WHITE, IChess.ChessType.TYP_PAWN, new Pawn());
        table [6][1] = new Piece(IChess.ChessColor.CLR_WHITE, IChess.ChessType.TYP_PAWN, new Pawn());
        table [7][1] = new Piece(IChess.ChessColor.CLR_WHITE, IChess.ChessType.TYP_PAWN, new Pawn());

        table [0][6] = new Piece(IChess.ChessColor.CLR_BLACK, IChess.ChessType.TYP_PAWN, new Pawn());
        table [1][6] = new Piece(IChess.ChessColor.CLR_BLACK, IChess.ChessType.TYP_PAWN, new Pawn());
        table [2][6] = new Piece(IChess.ChessColor.CLR_BLACK, IChess.ChessType.TYP_PAWN, new Pawn());
        table [3][6] = new Piece(IChess.ChessColor.CLR_BLACK, IChess.ChessType.TYP_PAWN, new Pawn());
        table [4][6] = new Piece(IChess.ChessColor.CLR_BLACK, IChess.ChessType.TYP_PAWN, new Pawn());
        table [5][6] = new Piece(IChess.ChessColor.CLR_BLACK, IChess.ChessType.TYP_PAWN, new Pawn());
        table [6][6] = new Piece(IChess.ChessColor.CLR_BLACK, IChess.ChessType.TYP_PAWN, new Pawn());
        table [7][6] = new Piece(IChess.ChessColor.CLR_BLACK, IChess.ChessType.TYP_PAWN, new Pawn());
        table [0][7] = new Piece(IChess.ChessColor.CLR_BLACK, IChess.ChessType.TYP_ROOK, new Rook());
        table [1][7] = new Piece(IChess.ChessColor.CLR_BLACK, IChess.ChessType.TYP_KNIGHT, new Knight());
        table [2][7] = new Piece(IChess.ChessColor.CLR_BLACK, IChess.ChessType.TYP_BISHOP, new Pawn());
        table [3][7] = new Piece(IChess.ChessColor.CLR_BLACK, IChess.ChessType.TYP_QUEEN, new Rook());
        table [4][7] = new Piece(IChess.ChessColor.CLR_BLACK, IChess.ChessType.TYP_KING, new Pawn());
        table [5][7] = new Piece(IChess.ChessColor.CLR_BLACK, IChess.ChessType.TYP_BISHOP, new Pawn());
        table [6][7] = new Piece(IChess.ChessColor.CLR_BLACK, IChess.ChessType.TYP_KNIGHT, new Knight());
        table [7][7] = new Piece(IChess.ChessColor.CLR_BLACK, IChess.ChessType.TYP_ROOK, new Rook());
    }

    public Piece getPieces(IChess.ChessPosition position){
        if ((position.x > IChess.BOARD_WIDTH) || (position.y > IChess.BOARD_HEIGHT) || (position.x < 0) || (position.y < 0)){
            return null;
        }
        return table [position.x][position.y];
    }

    public void movePiece(IChess.ChessPosition p0, IChess.ChessPosition p1){
        this.table[p1.x][p1.y] = this.table[p0.x][p0.y];
        this.table[p0.x][p0.y] = null;


    }


}
