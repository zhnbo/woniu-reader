package com.woniuxy.exception;

import com.woniuxy.result.ResponseResult;
import com.woniuxy.result.ResultStatusEnum;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authz.UnauthorizedException;
import org.springframework.validation.BindException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.validation.ValidationException;


/**
 * 全局异常处理器
 * @author: zh_o
 * @date: 2020-9-23
 */
@RestControllerAdvice
public class GlobalExceptionResolver {

	/**
	 * 参数校验异常
	 * @return
	 */
	@ExceptionHandler({BindException.class, ValidationException.class})
	public ResponseResult<?> bindException(Exception e) {
		e.printStackTrace();
		return ResponseResult.error(ResultStatusEnum.BIND_ERROR, null);
	}

	/**
	 * 其他异常
	 * @return
	 */
	@ExceptionHandler(Exception.class)
	public ResponseResult<?> othersException(Exception e) {
		e.printStackTrace();
		return ResponseResult.error(e.getMessage());
	}

	/**
	 * 账户不存在异常
	 * @param e
	 * @return
	 */
	@ExceptionHandler(UnknownAccountException.class)
	public ResponseResult<?> unknownAccountException(Exception e) {
		e.printStackTrace();
		return ResponseResult.error(ResultStatusEnum.UNKNOWN_ACCOUNT, null);
	}

	/**
	 * 凭证不正确异常
	 * @param e
	 * @return
	 */
	@ExceptionHandler(IncorrectCredentialsException.class)
	public ResponseResult<?> incorrectCredentialsException(Exception e) {
		e.printStackTrace();
		return ResponseResult.error(ResultStatusEnum.INCORRECT_CREDENTIALS, null);
	}


	/**
	 * 权限不足异常
	 * @param e
	 * @return
	 */
	@ExceptionHandler(UnauthorizedException.class)
	public ResponseResult<?> unauthorizedException(Exception e) {
		e.printStackTrace();
		return ResponseResult.error(ResultStatusEnum.UNAUTHORIZED, null);
	}
}
