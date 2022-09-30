package ks44team04.interceptor;

import java.util.Set;
import java.util.StringJoiner;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

@Component
public class CommonInterceptor implements HandlerInterceptor {
	private final Logger log = LoggerFactory.getLogger(getClass());

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {

		// parameter key
		Set<String> paramKeySet = request.getParameterMap().keySet();

		StringJoiner param = new StringJoiner(", ");

		for (String key : paramKeySet) {
			param.add(key + ": " + request.getParameter(key));
		}

		// 주소 요청시에 어떤 사용자 ip가 어떤 주소를 요청하고 파라미터 무엇인지 로그 작업
		log.info("=================================ACCESS INFO=================================");
		log.info("PORT :: {}", request.getLocalPort());
		log.info("SERVERNAME :: {}", request.getServerName());
		log.info("METHOD :: {}", request.getMethod());
		log.info("URI :: {}", request.getRequestURI());
		log.info("CLIENT IP :: {}", request.getRemoteAddr());
		log.info("parameter :: {}", param);
		log.info("=================================ACCESS INFO=================================");
		return true;
	}

}
