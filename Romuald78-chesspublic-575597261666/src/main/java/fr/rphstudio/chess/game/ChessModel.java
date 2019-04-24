package fr.rphstudio.chess.game;
import fr.rphstudio.chess.interf.EmptyCellException;
import fr.rphstudio.chess.interf.IChess;
import fr.rphstudio.chess.interf.OutOfBoardException;
import sun.util.resources.cldr.vai.CalendarData_vai_Latn_LR;

import java.util.ArrayList;
import java.util.List;


public class ChessModel implements IChess {

    private static IChess instance;
    private Board superBoard;


    private  ChessModel(){
        superBoard = new Board();
    }

    public static IChess getInstance(){
        if(ChessModel.instance == null){
            ChessModel.instance = new ChessModel();
        }
        return ChessModel.instance;
    }




    @Override
    public void reinit() {

    }

    @Override
    public ChessType getPieceType(ChessPosition p) throws EmptyCellException, OutOfBoardException {
        Piece pi = superBoard.getPieces(p);
        if (pi != null){
            return pi.getType();
        }
        throw new EmptyCellException();

    }

    @Override
    public ChessColor getPieceColor(ChessPosition p) throws EmptyCellException, OutOfBoardException {
        Piece po = superBoard.getPieces(p);
        if (po != null){
            return po.getColor();
        }
        throw new EmptyCellException();
    }

    @Override
    public int getNbRemainingPieces(ChessColor color) {
        int count = 0;
        for (int y=0; y< IChess.BOARD_HEIGHT;y++ ){
            for (int x=0; x< IChess.BOARD_WIDTH; x++){
                Piece piece = superBoard.getPieces(new ChessPosition(x, y));
                if ( piece != null ){
                    if (piece.getColor() == color){
                        count ++;
                    }

                }
            }
        }
        return count;
    }

    @Override
    public List<ChessPosition> getPieceMoves(ChessPosition p) {

        Piece pi = superBoard.getPieces(p);
        if (pi != null) {
            return pi.getMoves(p, superBoard);
        }
        return new ArrayList<>();
    }

    @Override
    public void movePiece(ChessPosition p0, ChessPosition p1) {

    }

    @Override
    public ChessKingState getKingState(ChessColor color) {
        return ChessKingState.KING_SAFE;
    }

    @Override
    public List<ChessType> getRemovedPieces(ChessColor color) {
        return new ArrayList<>();
    }

    @Override
    public boolean undoLastMove() {
        return false;
    }

    @Override
    public long getPlayerDuration(ChessColor color, boolean isPlaying) {
        return 0;
    }


}
