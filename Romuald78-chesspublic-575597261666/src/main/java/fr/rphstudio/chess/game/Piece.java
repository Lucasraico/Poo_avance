package fr.rphstudio.chess.game;

import fr.rphstudio.chess.interf.IChess;
import fr.rphstudio.chess.interf.IMove;

import java.util.List;

public class Piece  {
    private IChess.ChessColor color;
    private IChess.ChessType type;
    private IMove move;

    public Piece(IChess.ChessColor _color, IChess.ChessType _type, IMove _move) {
        this.color = _color;
        this.type = _type;
        this.move = _move;
    }

    public IChess.ChessColor getColor() {
        return color;
    }

    public IChess.ChessType getType() {
        return type;
    }

    public List<IChess.ChessPosition> getMoves(IChess.ChessPosition _pos, Board _board) {
        return move.getPossibleMoves(_pos, _board);
    }
}