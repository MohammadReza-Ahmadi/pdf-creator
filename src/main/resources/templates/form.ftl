<html>

<body>



<table width="400px" style="margin-left:0px;">
    <tr>
        <td colspan="2" align="center"><img src="file:///${logoUrl}"></td>
    </tr>

    <tr style="background-color: #4cff56; font-size: 18px; ">
        <td height="35px" style="color: white;font-weight: bold;font-size: 22px" align="center"  colspan="2"> شناسنامه سند الکترونیکی</td>
    </tr>
    <tr style="height: 28px;background-color: #B4E7FF; font-size: 15px;font-weight: bold;color: #3c3c3c; ">
        <td style="padding-left: 10px;" >${certName}</td>
        <td style="padding-right: 10px;" align="right">نام سند</td>
    </tr>

    <tr style="height: 28px;background-color: white; font-size: 15px;font-weight: bold;color: #3c3c3c; ">
        <td style="padding-left: 10px;">${certRetrieveId}</td>
        <td align="right" style="padding-right: 10px;">شناسه بازیابی سند</td>
    </tr>

    <tr align="right"  style="background-color: #B4E7FF; font-size: 15px;font-weight: bold;color: #3c3c3c; ">
        <td style="height: 40px; padding-right: 10px;" colspan="2">شناسه یکتای سند</td>
    </tr>

    <tr style="background-color: #B4E7FF; font-size: 15px;font-weight: bold;color: #374b68; ">
        <td colspan="2" style="padding-left: 10px;" height="35px;">${certId}</td>
    </tr>
    <tr style="background-color: white; font-family: 'Times New Roman'; font-size: 15px;font-weight: bold;color: #3c3c3c; ">
        <td  align="left" style="padding-left: 10px;"  height="30px;"></td>
        <td   align="right" style="padding-right: 10px;"   height="30px;">لینک دسترسی به سند</td>
    </tr>

    <tr style="background-color: #92BCFF; font-size: 15px;font-weight: bold;color: #121e2c; ">
        <td align="center" style="font-weight: bold; font-size: 20px" colspan="2" height="35px;">مشخصات صاحبان امضاء</td>
    </tr>

    <tr align="right" style="background-color: white; font-size: 15px;font-weight: bold;">
        <td colspan="2">
            <table border="0" >
                <tr>
                    <td style="border-radius: 50px;" rowspan="2"  align="left" style="padding-left:10px; text-align: left" >
                        <img style="border-radius: 100px; border-collapse: separate;" width="120px" height="160px" src="file:///${personPhotoUrl}">
                    </td>

                    <td  width="500px" align="right" style="color: #3c3c3c;font-weight: bold;padding-right: 10px; padding-top: 0px; font-size: 17px" colspan="2" height="35px; ">
                        نام و نام خانوادگی
                    </td>
                </tr>
                <tr>

                    <td colspan="2"  align="right" style="padding-left: 10px;color: #3c3c3c;"  >${fullName}</td>
                </tr>
            </table>
        </td>
    </tr>

    </tr>

    <tr style="height: 28px;background-color: #B4E7FF; font-size: 15px;font-weight: bold;color: #3c3c3c; ">
        <td style="padding-left: 10px;" >${identityNumber}</td>
        <td style="padding-right: 10px;" align="right">کد ملی</td>
    </tr>

    <tr style="height: 28px;background-color: white; font-size: 15px;font-weight: bold;color: #3c3c3c; ">
        <td style="padding-left: 10px;">${certNumber}</td>
        <td align="right" style="padding-right: 10px;">شماره شناسنامه</td>
    </tr>

    <tr style="height: 28px;background-color: #B4E7FF; font-size: 15px;font-weight: bold;color: #3c3c3c; ">
        <td style="padding-left: 10px;" >${birthDate}</td>
        <td style="padding-right: 10px;" align="right">تاریخ تولد</td>
    </tr>

    <tr style="height: 28px;background-color: white; font-size: 15px;font-weight: bold;color: #3c3c3c; ">
        <td style="padding-left: 10px;">${fatherName}</td>
        <td align="right" style="padding-right: 10px;">نام پدر</td>
    </tr>

    <tr style="height: 28px;background-color: #B4E7FF; font-size: 15px;font-weight: bold;color: #3c3c3c; ">
        <td style="padding-left: 10px;" >${phone}</td>
        <td style="padding-right: 10px;" align="right">شماره تلفن</td>
    </tr>

    <tr style="height: 28px;background-color: white; font-size: 15px;font-weight: bold;color: #3c3c3c; ">
        <td style="padding-left: 10px;">${email}</td>
        <td align="right" style="padding-right: 10px;">آدرس ایمیل</td>
    </tr>

    <tr style="background-color: #92BCFF; font-size: 15px;font-weight: bold;color: #121e2c; ">
        <td align="center" style="font-weight: bold; font-size: 20px" colspan="2" height="35px;">اصالت صاحب امضاء</td>
    </tr>
</table>
</body>
</html>