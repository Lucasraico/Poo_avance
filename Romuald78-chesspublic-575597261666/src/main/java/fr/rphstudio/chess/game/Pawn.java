package fr.rphstudio.chess.game;

import fr.rphstudio.chess.interf.IChess;
import fr.rphstudio.chess.interf.IMove;

import java.util.ArrayList;
import java.util.List;

public class Pawn implements IMove {

/*
    public IChess.ChessPosition moove(IChess.ChessPosition posA){
        boolean firstTime = false;
        IChess.ChessPosition posB;

        if (firstTime = false) {

            posB.x = posA.x;
            posB.y = posA.y + 2;
            firstTime = true;
        }else {
            posB.x= posA.x;
            posB.y= posA.x ++;
        }
        return posB;
    }*/

    public List<IChess.ChessPosition> getPossibleMoves(IChess.ChessPosition pos, Board board){
        List<IChess.ChessPosition> li = new ArrayList<>();
        li.add(new IChess.ChessPosition(5, 3));

        return li;
    }

}
