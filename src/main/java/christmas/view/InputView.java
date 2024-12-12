package christmas.view;

import camp.nextstep.edu.missionutils.Console;
import christmas.dto.OrderMapper;
import christmas.dto.OrderRequest;

import java.util.List;

import static christmas.global.constants.ViewMessage.INPUT_DAY_MESSAGE;
import static christmas.global.constants.ViewMessage.INPUT_ORDER_REQUEST_MESSAGE;
import static christmas.global.converter.Converter.toNumber;

public class InputView {
    private InputView(){
    }

    public static int inputDay(){
        System.out.println(INPUT_DAY_MESSAGE);
        String input = Console.readLine();
        return toNumber(input);
    }

    public static List<OrderRequest> inputOrderRequest(){
        System.out.println(INPUT_ORDER_REQUEST_MESSAGE);
        String input = Console.readLine();
        return OrderMapper.toOrderRequests(input);
    }
}
