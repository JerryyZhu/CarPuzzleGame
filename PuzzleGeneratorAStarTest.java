import static org.junit.Assert.*;

import org.junit.Test;

public class PuzzleGeneratorAStarTest {

	@Test
	public void test() {
		PuzzleGeneratorAStar foo = new PuzzleGeneratorAStar();
		//PuzzleGame bah = foo.generatePuzzle(5, 7, 0, 3, 20);
		PuzzleGame bah = foo.generateHardPuzzle();
		if (bah == null) {
			System.out.println("Could not generate puzzle");
		} else {
			bah.showBoard();
		}
	}

}
