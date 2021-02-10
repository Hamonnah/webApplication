package com.web.application.mapper;

import com.web.application.domain.Order;
import com.web.application.dto.OrderDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class OrderMapper {

    @Autowired
    ProductMapper productMapper;
    @Autowired
    UserMapper userMapper;

  /*  public Order mapToOrder(final OrderDto orderDto) {
        return new Order(
                orderDto.getId(),
                orderDto.getDateIn(),
                //userMapper.mapUserDtoToUser(orderDto.getUserDto()),
                //productMapper.mapToProductList(orderDto.getProductDtoList()));
    }
    public OrderDto mapToOrderDto(final Order order){
        return new OrderDto(
                order.getId(),
                order.getDateIn(),
                userMapper.mapUserToUserDto(order.getUser()),
                //productMapper.mapToProductDtoList(order.getProductList()));
    }*/

    public List<OrderDto> mapToOrderDtoList(final List<Order> ordersList) {
        return ordersList.stream()
                .map(o -> new OrderDto(
                        o.getId(),
                        o.getDateIn(),
                        userMapper.mapUserToUserDto(o.getUser()),
                        productMapper.mapToProductDtoList(o.getProductsList())))
                .collect(Collectors.toList());
    }
}
