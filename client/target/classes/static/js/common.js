/*项目路径*/
var baseUrl = 'http://qa-item.scm.zhongpin.cn';

function postcall(url, params, target) {
	var tempform = document.createElement("form");
	tempform.action = url;
	tempform.method = "post";
	tempform.style.display = "none"
	if(target) {
		tempform.target = target;
	}

	for(var x in params) {
		var opt = document.createElement("input");
		opt.name = x;
		opt.value = params[x];
		tempform.appendChild(opt);
	}

	var opt = document.createElement("input");
	opt.type = "submit";
	tempform.appendChild(opt);
	document.body.appendChild(tempform);
	tempform.submit();
	document.body.removeChild(tempform);
}

/*
 * @description 格式化时间
 * @param fmt string			格式："yyyy-MM-dd h:m:s"
 */
Date.prototype.Format = function(fmt) {  
	var o = {    
		"M+": this.getMonth() + 1, //月份
		    "d+": this.getDate(), //日
		    "h+": this.getHours(), //小时
		    "m+": this.getMinutes(), //分
		    "s+": this.getSeconds(), //秒
		    "q+": Math.floor((this.getMonth() + 3) / 3), //季度
		    "S": this.getMilliseconds() //毫秒
		  
	};  
	if(/(y+)/.test(fmt)) fmt = fmt.replace(RegExp.$1, (this.getFullYear() + "").substr(4 - RegExp.$1.length));  
	for(var k in o)  
		if(new RegExp("(" + k + ")").test(fmt)) fmt = fmt.replace(RegExp.$1, (RegExp.$1.length == 1) ? (o[k]) : (("00" + o[k]).substr(("" + o[k]).length)));  
	return fmt;
}

$(function() {
	/*
	 * @description 通用弹出层
	 */
	var deTab = {
		isIE6: !-[1, ] && !window.XMLHttpRequest,
		popBox: $(".popBox"),
		closeBtn: $(".popClose"),
		maskBlack: $(".popMask_black"),
		targetObj: null,
		bgClick: null,
		btnClickFn: function(obj) {
			_this = this;
			var targetPop = obj.attr("data-popfor");
			obj.on("click", function(e) {
				e.preventDefault();
				_this.resizeBox(obj);
			});
		},
		closeBtnFn: function(options) {
			var _this = this;
			this.closeBtn.on("click", function() {
				if(_this.closeClick) {
					$(this).parent().hide();
					_this.maskBlack.hide();
				}
			});
		},
		maskBlackFn: function() {
			var _this = this;
			if(this.bgClick) {
				this.maskBlack.on("click", function() {
					_this.popBox.hide();
					$(this).hide();
				})
			}
		},
		initFn: function(obj, options) {
			this.bgClick = (options && (typeof(options.bgClick) != "undefined")) ? options.bgClick : true;
			this.closeClick = (options && (typeof(options.closeClick) != "undefined")) ? options.closeClick : true;
			this.targetObj = obj;
			this.btnClickFn(obj);
			this.closeBtnFn();
			this.maskBlackFn();
		},
		changePopBox: function() {
			var targetPops = this.targetObj.attr("data-popfor");
			var popWidth = $("." + targetPops).width(),
				popHeight = $("." + targetPops).height();
			this.isIE6 ? popHeight -= 200 : "";
			var popWidthHalf = -(popWidth / 2),
				popHeightHalf = -(popHeight / 2);
			if(targetPops) {
				$("." + targetPops).css({
					width: popWidth,
					//						height:popHeight,
					//					"margin-top": popHeightHalf,
					"margin-left": popWidthHalf
				})
			};
		},
		resizeBox: function(obj) {
			var targetPop = obj.attr("data-popfor");
			var popWidth = $("." + targetPop).width(),
				popHeight = $("." + targetPop).height();
			this.isIE6 ? popHeight -= 200 : "";
			var popWidthHalf = -(popWidth / 2),
				popHeightHalf = -(popHeight / 2);
			//			console.log(popHeightHalf);
			if(targetPop) {
				$("." + targetPop).css({
					width: popWidth,
					//					"margin-top": popHeightHalf,
					"margin-left": popWidthHalf
				}).show();
				$(".popMask_black").show();
			};
		},
		popBoxHide: function() {
			this.popBox.hide();
			this.maskBlack.hide();
		},
		popBoxShow: function(obj, options) {
			this.bgClick = (options && (typeof(options.bgClick) != "undefined")) ? options.bgClick : true;
			this.closeClick = (options && (typeof(options.closeClick) != "undefined")) ? options.closeClick : true;
			this.targetObj = obj;
			this.resizeBox(obj);
			this.closeBtnFn();
			this.maskBlackFn();
		}
	};
	
	window.deTab = deTab;
});