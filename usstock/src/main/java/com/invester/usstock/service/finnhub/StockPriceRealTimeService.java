package com.invester.usstock.service.finnhub;

import com.invester.usstock.model.dto.finnhub.QuoteDTO;

public interface StockPriceRealtimeService {

    QuoteDTO getQuote(String symbol);
    
}
