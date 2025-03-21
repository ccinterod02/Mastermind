package cinterodiaz.mastermind.types;

public enum Error {
    WRONG_COLOURS, DUPLICATED_CHARS, WRONG_SIZE, NO_ERROR;

    public boolean isNoError() {
        return this == Error.NO_ERROR;
    }

}
