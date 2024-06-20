package in.ineuron.service;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

@Service
public class WishMessageServiceImpl implements IWishMessageService {

	@Override
	public String generateWishMessage() {
		
		LocalDateTime ldt=LocalDateTime.now();
		int hour=ldt.getHour();
		if(hour<12) {
			return "Good morning";
		}
		else if(hour<16) {
			return "Good afternoon";
		}
		else if(hour<20) {
			return "Good evening";
		}
		else{
			return "Good night";
		}
		
	}
}
