
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page errorPage="error.jsp"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>JSP Calculation</h1>
        <jsp:useBean id="math" scope="session" class="beans.MathBean" />
        <jsp:useBean id="primenumber" scope="session" class="beans.PrimeBean" />
        <jsp:setProperty name="math" property="*"/>
        <jsp:setProperty name="primenumber" property="prime"/>
        <form name="form1" method="post">
            <table>
                <tr>
                    <td>A:</td>
                    <td><input type="text" name="numbera" value="${math.numbera}" style="width:130px"/></td>
                </tr>
                <tr>
                    <td>B:</td>
                    <td><input type="text" name="numberb" value="${math.numberb}" style="width:130px"/></td>
                </tr>
                <tr>
                    <td colspan="2" style="text-align: right"><input type="submit" value="OK!" /></td>                    
                </tr>
            </table>                
        </form>
        <table>
            <tr>
                <td>Addition</td><td>${math.add()}</td>                        
            </tr>
            <tr>
                <td>Subtract</td><td>${math.sub()}</td>                        
            </tr>
            <tr>
                <td>Multiply</td><td>${math.mul()}</td>                        
            </tr>
            <tr>
                <td>Divide</td><td>${math.divide()}</td>                        
            </tr>
            <tr>
                <td>Modulus</td><td>${math.modulus()}</td>                        
            </tr>
            <tr>
                <td>${math.numbera} to the extent ${math.numberb}</td><td>${math.expon()}</td>                        
            </tr>
            <tr>
                <td>Square root of ${math.numbera}; ${math.numberb}</td><td>${math.squareroota()}; ${math.squarerootb()}</td>                        
            </tr>
            <tr>
                <td>Cube root of ${math.numbera}; ${math.numberb}</td><td>${math.cuberoota()}; ${math.cuberootb()}</td>                        
            </tr>
            <tr>
                <td>Sine of angle ${math.numbera}°; ${math.numberb}°</td><td>${math.sinea()}; ${math.sineb()}</td>                        
            </tr>
            <tr>
                <td>Cosine of angle ${math.numbera}°; ${math.numberb}°</td><td>${math.cosinea()}; ${math.cosineb()}</td>                        
            </tr>
            <tr>
                <td>Tangent of angle ${math.numbera}°; ${math.numberb}°</td><td>${math.tangenta()}; ${math.tangentb()}</td>                        
            </tr>
        </table>
        <form name="form2" method="post">
            <input type="text" name="primenumber" value="${primenumber.prime}"/>&nbsp;&nbsp;<input type="submit" value="OK!">
        </form>
        <p><a href="Primes?number=next">Next prime</a></p>
        <p><a href="Primes?number=previous">Previous prime</a></p>
    </body>
</html>
