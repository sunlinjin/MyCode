# -*- coding: utf-8 -*-
"""
Created on Tue Nov 28 10:58:32 2017

@author: 王崇菲
"""

import requests
cookies=dict(__cfduid='dac4943422d8c9e73abf65f702b9b39171511698740', PHPSESSID='uepr0r1gv6fvhtkkrds6hrjkbu')
r=requests.get("https://www.xinyongheimingdan.cc/blacklist-GWQBCsBCSs.html",cookies=cookies)

import re
print (r.text)
pattern=re.compile(r'支付宝：')
result1=re.match(pattern,r.text)

print (result1)