using System.IO;
using System.Net;
using System.Threading.Tasks;
using System.ComponentModel.DataAnnotations;
using Microsoft.AspNetCore.Http;
using Microsoft.AspNetCore.Mvc;
using Microsoft.Azure.WebJobs;
using Microsoft.Azure.WebJobs.Extensions.Http;
using Microsoft.Azure.WebJobs.Extensions.OpenApi.Core.Attributes;
using Microsoft.Azure.WebJobs.Extensions.OpenApi.Core.Enums;
using Microsoft.Extensions.Logging;
using Microsoft.OpenApi.Models;
using Newtonsoft.Json;
using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Functions
{ 
    public partial class DefaultApi
    { 
        [FunctionName("DefaultApi_GetApiAllJson")]
        public async Task<ActionResult<List<string>>> _GetApiAllJson([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/all.json")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("GetApiAllJson");
            return method != null
                ? (await ((Task<List<string>>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("DefaultApi_GetApiProductCycleJson")]
        public async Task<ActionResult<Cycle>> _GetApiProductCycleJson([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/{product}/{cycle}.json")]HttpRequest req, ExecutionContext context, string product, string cycle)
        {
            var method = this.GetType().GetMethod("GetApiProductCycleJson");
            return method != null
                ? (await ((Task<Cycle>)method.Invoke(this, new object[] { req, context, product, cycle })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("DefaultApi_GetApiProductJson")]
        public async Task<ActionResult<List<Cycle>>> _GetApiProductJson([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/{product}.json")]HttpRequest req, ExecutionContext context, string product)
        {
            var method = this.GetType().GetMethod("GetApiProductJson");
            return method != null
                ? (await ((Task<List<Cycle>>)method.Invoke(this, new object[] { req, context, product })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
