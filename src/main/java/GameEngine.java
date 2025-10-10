public class GameEngine {
    private static final int MAX_ATTEMPTS = 10;

    private final int min;
    private final int max;

    private int target;
    private int attempts;

    private boolean gameWon;
    private boolean userQuit;
    private boolean gameOver;

    public GameEngine(int min, int max) {
        this.min = min;
        this.max = max;

        reset();
    }

    public GuessResult makeGuess(int guess) {
        if (guess < 0) {
            userQuit = true;
            gameOver = true;

            return new GuessResult(false, "Exiting game...", attempts);
        }

        attempts++;

        if (guess == target) {
            gameWon = true;
            gameOver = true;

            GuessResult result = new GuessResult(
                    true,
                    "Correct! You guessed it in " + attempts + " attempts.",
                    attempts
            );

            result.setRemainingAttempts(MAX_ATTEMPTS - attempts);
            return result;
        }

        if (attempts >= MAX_ATTEMPTS) {
            gameOver = true;

            return new GuessResult(
                    false,
                    "Game over. You used all " + MAX_ATTEMPTS
                            + " attempts. The number was " + target + ".",
                    attempts
            );
        }

        int remaining = MAX_ATTEMPTS - attempts;
        String message;

        if (guess < target) {
            message = "Too low! Try a higher number.";
        } else {
            message = "Too high! Try a lower number.";
        }

        GuessResult result = new GuessResult(false, message, attempts);
        result.setRemainingAttempts(remaining);

        return result;
    }

    public void reset() {
        target = Utils.randomInt(min, max);

        attempts = 0;
        gameWon = false;
        userQuit = false;
        gameOver = false;
    }

    public boolean isGameWon() {
        return gameWon;
    }

    public boolean hasUserQuit() {
        return userQuit;
    }

    public boolean isGameOver() {
        return gameOver;
    }

    public int getAttempts() {
        return attempts;
    }

    public int getMaxAttempts() {
        return MAX_ATTEMPTS;
    }

    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }

    // Used only by the test file
    protected void setTarget(int target) {
        this.target = target;
    }

    protected int getTarget() {
        return target;
    }
}