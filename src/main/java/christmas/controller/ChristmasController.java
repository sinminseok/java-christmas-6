package christmas.controller;

import christmas.dto.OrderRequest;
import christmas.view.InputView;
import christmas.view.OutputView;

import java.util.List;

public class ChristmasController {

    public void run(){
        OutputView.printStartMessage();
        int day = InputView.inputDay();
        List<OrderRequest> orderRequests = InputView.inputOrderRequest();
    }
}
