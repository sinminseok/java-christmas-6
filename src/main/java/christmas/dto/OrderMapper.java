package christmas.dto;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static christmas.global.converter.Converter.toNumber;

public class OrderMapper {

    private OrderMapper(){
    }

    public static List<OrderRequest> toOrderRequests(String input){
        return Arrays.stream(input.split(","))
                .map(value -> {
                    String[] split = value.split("-");
                    return new OrderRequest(split[0], toNumber(split[1]));
                }).collect(Collectors.toList());
    }
}
