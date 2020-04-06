1. A deck of cards, you need a deck, values of cards, suits
2. Shuffle the deck, lay out nine cards face up, select two cards that add up to 11 or a jack, queen, and king, remove the selected from the nine and replace with new cards, repeat until all cards are removed, or no cards can be selected.
3. Yes it does.
4.  a) newGame, ElevensBoard
    b) anotherPlayIsPossible, isLegal
    c) jack, 6, 2, ace, 4
    d) for (int k = 0; k < cIndexes.size(); k++) {
        System.out.println(cIndexes.get(k));
    }
    e) anotherPlayIsPossible, isLegal, as otherwise you will be checking null values.