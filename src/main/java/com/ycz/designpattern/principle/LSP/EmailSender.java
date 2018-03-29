package com.ycz.designpattern.principle.LSP;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EmailSender {

    private static final Logger logger = LoggerFactory.getLogger(EmailSender.class);

    public void sendEmail(Customer customer) {
        logger.debug("send email name {} address {}", customer.getName(), customer.getEmail());
    }
}
