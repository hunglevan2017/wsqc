package com.saigonbpo.wsqc.Security;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.encoding.Md5PasswordEncoder;
import org.springframework.security.authentication.encoding.PasswordEncoder;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.oauth2.client.test.OAuth2ContextConfiguration.Password;
import org.springframework.stereotype.Service;
import org.yaml.snakeyaml.external.biz.base64Coder.Base64Coder;

import com.saigonbpo.wsqc.Service.UserFeService;




@Service("customUserDetailsService")
public class CustomUserDetailsService implements UserDetailsService {

	static final Logger logger = LoggerFactory.getLogger(CustomUserDetailsService.class);
	
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	
	//@Autowired
	//Md5PasswordEncoder passwordEncoderMD5;
	
	@Autowired
	private UserFeService userService;
	
	//@Autowired
    //private BCryptPasswordEncoder passwordEncoder;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		// TODO Auto-generated method stub
		Map<String,Object> account = userService.findByUserName(username);

		
		//accountPassword
		String password =  passwordEncoder.encode( "123"  );
		logger.info( "Bcryt:" + password );
		logger.info( "Bcryt:" + account.get("bcrypt") );
		
		if(account==null){
			logger.info("User not found");
			throw new UsernameNotFoundException("Account Not Found");
		}
		
		logger.info("account:" + account);
		
		
		//accountService.updateLastLogin(username);
		
		
		List<GrantedAuthority> authorityAccount = getGrantedAuthorities(account);
		//return new org.springframework.security.core.userdetails.User(account.getUsername(), account.getPassword(), 
		//		account.isEnabled(), account.isExpired(), account.isCredentials_expired(), account.isLocked(), authorityAccount);
		
		//logger.info("account.getPassword: "+ account.getPassword());
		//List<GrantedAuthority> authorityAccount = getGrantedAuthoritiesTemp();
	

		
		//account.get("bcrypt").toString()
		return new org.springframework.security.core.userdetails.User(username, account.get("bcrypt").toString() , 
				(boolean)account.get("is_enable"), true, true, (boolean)account.get("is_enable"), authorityAccount);
		
		
//		return new org.springframework.security.core.userdetails.User(username, password , 
//				true, true, true, (boolean)account.get("is_enable"), authorityAccount);
	}	
	
	private List<GrantedAuthority> getGrantedAuthorities(Map<String,Object> account){
		
		List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
	
		authorities.add( new SimpleGrantedAuthority( "ROLE_"+ account.get("cc_role").toString().toUpperCase() ) );
		//authorities.add( new SimpleGrantedAuthority( "ROLE_CC"));
		
		
		
		logger.info("Account: "+ account.toString());
		
		//authorities.add( new SimpleGrantedAuthority("ROLE_CC") );
		logger.info("authorities : {}", authorities);
		return authorities;
	}
	
	/*
	private List<GrantedAuthority> getGrantedAuthoritiesTemp(){
		
		List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
		authorities.add( new SimpleGrantedAuthority("ROLE_ADMIN"));
		return authorities;
	}
	*/
	
	

}
