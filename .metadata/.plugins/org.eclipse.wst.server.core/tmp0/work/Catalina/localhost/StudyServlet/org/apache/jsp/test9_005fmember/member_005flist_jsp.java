/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.70
 * Generated at: 2023-02-28 03:19:12 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.test9_005fmember;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import test8_member.MemberDTO;
import java.util.List;

public final class member_005flist_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("test8_member.MemberDTO");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "top.jsp", out, false);
      out.write("\r\n");
      out.write("	<div align=\"center\">\r\n");
      out.write("		<h1>회원 목록 조회</h1>\r\n");
      out.write("		<table border=\"1\">\r\n");
      out.write("			<tr>\r\n");
      out.write("				<th>번호</th>\r\n");
      out.write("				<th>이름</th>\r\n");
      out.write("				<th>아이디</th>\r\n");
      out.write("				<th>E-Mail</th>\r\n");
      out.write("				<th>성별</th>\r\n");
      out.write("				<th>가입일</th>\r\n");
      out.write("				<th></th>\r\n");
      out.write("			</tr>	\r\n");
      out.write("			");

			// request.setAttribute() 메서드를 통해 저장된 데이터(객체)는
			// request.getAttribute() 메서드를 통해 꺼낼 수 있다!
			// => 단, 리턴타입이 Object 타입이므로 다운캐스팅(형변환) 필수!
			// "memberList" 속성명으로 저장된 객체 꺼내기(Object -> List<MemberDTO> 다운캐스팅)
			List<MemberDTO> memberList = (List<MemberDTO>)request.getAttribute("memberList");
			
			// List 객체에 순차 접근을 위한 for문
			// 1) 일반 for문
// 			for(int i = 0; i < memberList.size(); i++) {
// 				// MemberList 객체의 get() 메서드를 호출하여 MemberDTO 객체 꺼내기
// 				// => 파라미터 : 리스트 객체의 인덱스(i)
// 				MemberDTO member = memberList.get(i);
// 			}
			
			// 2) 향상된 for문
			for(MemberDTO member : memberList) {
				
      out.write("\r\n");
      out.write("				");
      out.write("\r\n");
      out.write("				");
      out.write("\r\n");
      out.write("				<tr>\r\n");
      out.write("					<td>");
      out.print(member.getIdx() );
      out.write("</td>\r\n");
      out.write("					<td>");
      out.print(member.getName() );
      out.write("</td>\r\n");
      out.write("					<td>");
      out.print(member.getId() );
      out.write("</td>\r\n");
      out.write("					<td>");
      out.print(member.getEmail() );
      out.write("</td>\r\n");
      out.write("					<td>");
      out.print(member.getGender() );
      out.write("</td>\r\n");
      out.write("					<td>");
      out.print(member.getHire_date() );
      out.write("</td>\r\n");
      out.write("					<td>\r\n");
      out.write("						");
      out.write("\r\n");
      out.write("						<input type=\"button\" value=\"수정\" onclick=\"location.href='dbcp_test4_member_info.jsp?id=");
      out.print(member.getId() );
      out.write("'\">\r\n");
      out.write("						<input type=\"button\" value=\"삭제\">\r\n");
      out.write("					</td>\r\n");
      out.write("				</tr>\r\n");
      out.write("				");

			}
			
      out.write("\r\n");
      out.write("			\r\n");
      out.write("		</table>\r\n");
      out.write("	</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
