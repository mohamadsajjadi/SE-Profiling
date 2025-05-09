# SE-Profiling

**قسمت اول تمرین**

<img width="915" alt="pic1" src="https://github.com/user-attachments/assets/8d6f4989-de99-45f0-97f9-ae51f6019ba0" />

همانطور که مشاهده میکنید در تصویر لاین ۳۰ حدود ۱۰۸۸ میلی ثانیه طول میکشد که زیاد است ولی برنامه باورودی های 1 , 2 ,3  به درستی ران میشود و جواب No را برمیگرداند.
در تصویر هم زیر میزان مصرف منابع را در اپ yourkit مشاهده میکنید.
<img width="1246" alt="Screenshot 2025-05-09 at 20 47 10" src="https://github.com/user-attachments/assets/4a0b57f8-3fc0-4b1d-9ef3-7ccca3d529c5" />

**برنامه بعد از تغییراتی که در کد داده شد**

<img width="1516" alt="Screenshot 2025-05-09 at 20 51 19" src="https://github.com/user-attachments/assets/3f91ea25-f66a-4ead-b887-9b0526c5d3cf" />

همانطور که مشاهده میکنید برنامه به ۵۰ میلی ثانیه تقلیل داده شد

 در تصویر زیر هم میزان مصرف منابع را مشاهده میکنید بعد از تغییرات.
<img width="1268" alt="Screenshot 2025-05-09 at 20 53 10" src="https://github.com/user-attachments/assets/adb72ddb-b695-4658-990c-0f9c9086d1a3" />


***قسمت دوم تمرین***

کدی که زده شده در یک فایل جدید برای سنجیدن شناسایی بیشتر میزان مصرف منابع:
پیدا کردن تعداد اعداد اول تا یک عدد خاص که در کد عدد یک میلیون قرار داده شده است، یعنی اینکه تا عدد یک میلیون چندین تا عدد اول داریم.
<img width="1377" alt="Screenshot 2025-05-09 at 21 02 39" src="https://github.com/user-attachments/assets/ede1e25a-8462-49f0-8e36-70f499e5dc8b" />

در عکس میزان تایم گرفته شده در لاین‌هایی که زیاد است مشاهده میکنید که مشخصا در لاین ۲۵
زیاد است.
این هم عکس مربوط به مصرف منابع در نرم افزار مربوطه:
<img width="1323" alt="Screenshot 2025-05-09 at 21 05 05" src="https://github.com/user-attachments/assets/4881d74a-5053-48d3-b574-0b11ceb5c12f" />


حالا بعد از اینکه کد را عوض کردیم داریم:
<img width="1219" alt="Screenshot 2025-05-09 at 21 26 47" src="https://github.com/user-attachments/assets/0ebd8618-f808-4041-b160-3a699f5804cc" />


کد از تقریبا ۱۸ ثانیه به بیست و سه میلی ثانیه رسید.

در تصویر زیر که در اپ پروفایلینگ است مشاهده میشود که آبجکت مربوطه بهش ساخته شده ولی چون هیچ لودی روی منابع سیستم نداره چیزی نشون نمیده ولی خب بهبود آن در زمان ران شدن آن مشخص است
<img width="1585" alt="Screenshot 2025-05-09 at 21 25 10" src="https://github.com/user-attachments/assets/2fbbfde5-8cd6-4866-872d-51eb6cf4f153" />

منتها برای اینکه بشه یه چیزی رو دید اومدم یه تغییری توی کد دادم و یه اسلیپ ۳۰ ثانیه ای رو گذاشتم و نتیجه شد اینی که پایین مشاهده میکنید و اولش cpu زیاد هست بخاطر این اسلیپی که گذاشتم. 
<img width="1628" alt="Screenshot 2025-05-09 at 21 35 59" src="https://github.com/user-attachments/assets/1b48cbc3-78c5-4020-a841-6bf5371dc786" />

