package com.woniuxy.exception;

import com.woniuxy.result.ResponseResult;
import com.woniuxy.result.ResultStatusEnum;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authz.UnauthorizedException;
import org.springframework.validation.BindException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletResponse;
import javax.xml.bind.ValidationException;


/**
 * 全局异常处理器
 * @author: zh_o
 * @date: 2020-9-23
 */
@RestControllerAdvice
public class GlobalExceptionResolver {

	/**
	 * 参数校验异常
	 * @param response
	 * @return
	 */
	@ExceptionHandler({BindException.class, ValidationException.class})
	public ResponseResult<?> bindException(HttpServletResponse response, Exception e) {
		e.printStackTrace();
		return ResponseResult.error(ResultStatusEnum.BIND_ERROR);
	}

	/**
	 * 其他异常
	 * @param response
	 * @return
	 */
	@ExceptionHandler(Exception.class)
	public ResponseResult<?> othersException(HttpServletResponse response, Exception e) {
		e.printStackTrace();
		return ResponseResult.error();
	}

	/**
	 * 账户不存在异常
	 * @param response
	 * @param e
	 * @return
	 */
	@ExceptionHandler(UnknownAccountException.class)
	public ResponseResult<?> unknownAccountException(HttpServletResponse response, Exception e) {
		e.printStackTrace();
		return ResponseResult.error(ResultStatusEnum.UNKNOWN_ACCOUNT);
	}

	/**
	 * 凭证不正确异常
	 * @param response
	 * @param e
	 * @return
	 */
	@ExceptionHandler(IncorrectCredentialsException.class)
	public ResponseResult<?> incorrectCredentialsException(HttpServletResponse response, Exception e) {
		e.printStackTrace();
		return ResponseResult.error(ResultStatusEnum.INCORRECT_CREDENTIALS);
	}


	/**
	 * 权限不足异常
	 * @param response
	 * @param e
	 * @return
	 */
	@ExceptionHandler(UnauthorizedException.class)
	public ResponseResult<?> unauthorizedException(HttpServletResponse response, Exception e) {
		e.printStackTrace();
		return ResponseResult.error(ResultStatusEnum.UNAUTHORIZED);
	}
}
