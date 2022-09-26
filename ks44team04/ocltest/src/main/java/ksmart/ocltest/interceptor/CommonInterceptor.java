package ksmart.ocltest.interceptor;

import java.util.Set;
import java.util.StringJoiner;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

@Component
public class CommonInterceptor implements HandlerInterceptor{

	
	private static final Logger log = LoggerFactory.getLogger(CommonInterceptor.class);

	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		
		Set<String> paramKeySet =  request.getParameterMap().keySet();
		
		//memberId=id001, memberPw=pw001 ...........
		StringJoiner param = new StringJoiner(", ");
		
		for(String key : paramKeySet) {
			//memberId: id001, memberPw: pw001 ...........
			param.add(key + ": " + request.getParameter(key));
		}
		
		// TODO 주소요청시에 어떤 사용자 ip가 어떤 주소를 요청하고 파라미터 무엇인지 로그 작업
		log.info("ACCESS INFO ==================================================");
		log.info("PORT 		::::::::	{}", request.getLocalPort());
		log.info("ServerName		::::::::	{}", request.getServerName());
		log.info("Method 		::::::::	{}", request.getMethod());
		log.info("URI 		::::::::	{}", request.getRequestURI());
		log.info("CLIENT IP		::::::::	{}", request.getRemoteAddr());
		log.info("parameter		::::::::	{}", param);
		log.info("ACCESS INFO ==================================================");
		
		return HandlerInterceptor.super.preHandle(request, response, handler);
	}
}
