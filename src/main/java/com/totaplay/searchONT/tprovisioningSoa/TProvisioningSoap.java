package com.totaplay.searchONT.tprovisioningSoa;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.5.0
 * 2022-02-14T19:56:28.539-06:00
 * Generated source version: 3.5.0
 *
 */
@WebService(targetNamespace = "http://tempuri.org/", name = "TProvisioningSoap")
@XmlSeeAlso({ObjectFactory.class})
public interface TProvisioningSoap {


    @WebMethod(operationName = "GetSearchONT_Dash", action = "http://tempuri.org/GetSearchONT_Dash")
    @RequestWrapper(localName = "GetSearchONT_Dash", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetSearchONTDash")
    @ResponseWrapper(localName = "GetSearchONT_DashResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetSearchONTDashResponse")
    @WebResult(name = "GetSearchONT_DashResult", targetNamespace = "http://tempuri.org/")
    public com.totaplay.searchONT.tprovisioningSoa.ArrayOfModelGetONT getSearchONTDash(

        @WebParam(name = "strvalue", targetNamespace = "http://tempuri.org/")
        java.lang.String strvalue
    );

   

    @WebMethod(operationName = "GetSearchONT", action = "http://tempuri.org/GetSearchONT")
    @RequestWrapper(localName = "GetSearchONT", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetSearchONT")
    @ResponseWrapper(localName = "GetSearchONTResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetSearchONTResponse")
    @WebResult(name = "GetSearchONTResult", targetNamespace = "http://tempuri.org/")
    public com.totaplay.searchONT.tprovisioningSoa.ArrayOfModelGetONT getSearchONT(

        @WebParam(name = "strvalue", targetNamespace = "http://tempuri.org/")
        java.lang.String strvalue
    );


}
