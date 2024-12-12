package christmas.view;

import camp.nextstep.edu.missionutils.Console;

import static christmas.global.constants.ViewMessage.INPUT_DAY_MESSAGE;
import static christmas.global.converter.Converter.toNumber;

public class InputView {
    private InputView(){
    }

    public static int inputDay(){
        System.out.println(INPUT_DAY_MESSAGE);
        String input = Console.readLine();
        return toNumber(input);
    }
}
