package com.sig.team.webworks.ekirana.model.restsupport.resources;

public class RestSuccessWithConfigUpdate extends RestSuccess {

	private static final long serialVersionUID = 6484684034108281570L;
	
	private class Config {
		private Integer xmlRowId;
		private Integer configUpdateId;
		@SuppressWarnings("unused")
		public Integer getXmlRowId() {
			return xmlRowId;
		}
		public void setXmlRowId(Integer xmlRowId) {
			this.xmlRowId = xmlRowId;
		}
		@SuppressWarnings("unused")
		public Integer getConfigUpdateId() {
			return configUpdateId;
		}
		public void setConfigUpdateId(Integer configUpdateId) {
			this.configUpdateId = configUpdateId;
		}
	}
	
	private Config config; 
	
/*	public RestSuccessWithConfigUpdate(String resourceLocation, String type, String message, String i18nMessageKey, String messageKeys, String messageValues, ConfigUpdate configUpdate) {	
		super(resourceLocation,type,message,i18nMessageKey,messageKeys,messageValues);
		config = new Config();
		config.setConfigUpdateId(configUpdate.getConfig_update_id());
		config.setXmlRowId(configUpdate.getXmlrowId());
		
	}*/
	
	public RestSuccessWithConfigUpdate(String resourceLocation, String type, String message, String i18nMessageKey, String messageKeys, String messageValues, Integer configUpdateId, Integer xmlRowId){
		super(resourceLocation,type,message,i18nMessageKey, messageKeys,messageValues);
		config = new Config();
		config.setConfigUpdateId(configUpdateId);
		config.setXmlRowId(xmlRowId);
	}
	
	public RestSuccessWithConfigUpdate(String resourceLocation, String type, String message, String i18nMessageKey, Integer configUpdateId, Integer xmlRowId){
		super(resourceLocation,type,message,i18nMessageKey);
		config = new Config();
		config.setConfigUpdateId(configUpdateId);
		config.setXmlRowId(xmlRowId);
	}
	
	public Config getConfig() {
		return config;
	}
}
